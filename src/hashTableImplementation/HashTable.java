package hashTableImplementation;

public class HashTable<K,V>  implements IHashTable<K,V>{
    private int m;
    private HashNode<K,V>[] table;

    //Constructor with the parameter m
    public HashTable(int m) {
        this.m = m;
        table = new HashNode[m];
    }

    //Constructor without the parameter m
     public HashTable() {
        m = 997;
        table = new HashNode[m];
    }

    public int hash(Object key) {
        return (Math.abs(key.hashCode())) % m;
    }

    @Override
    public void insert(K key, V value) throws Exception {
        int insertKey = hash(key);
        HashNode<K,V> nodeList = table[insertKey];

        if(nodeList == null) {
            table[insertKey] = new HashNode<>(key, value);
        } else {
            while (nodeList != null) {
                if(nodeList.getKey().equals(key)) {
                    break;
                }
                nodeList = nodeList.getNext();
            }
            HashNode<K,V> finalNode = new HashNode<>(key, value);
            table[insertKey].setPrevious(finalNode);
            table[insertKey] = finalNode;
        }
    }

    @Override
    public V search(K key) {
        V value = null;
        int searchKey = hash(key);
        HashNode<K,V> searchNode = table[searchKey];
        while (searchNode != null) {
            if(searchNode.getKey().equals(key)){
                value = searchNode.getValue();
            }
            searchNode = searchNode.getNext();
        }
        return value;
    }

    @Override
    public void delete(K key) {
        int deleteKey = hash(key);
        HashNode<K,V> deleteNode = table[deleteKey];
        while (deleteNode != null){
            if(deleteNode.getKey().equals(key)){
                HashNode<K,V> prev = deleteNode.getPrevious();
                HashNode<K,V> next = deleteNode.getNext();
                prev.setNext(next);
                next.setPrevious(prev);
            }
            deleteNode = deleteNode.getNext();
        }
    }
}
