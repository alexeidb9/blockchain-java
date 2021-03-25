public class Main {

    public static void main(String[] args) {
        Blockchain blockchain = new Blockchain(4);
        blockchain.addBlock(blockchain.newBlock("Test Bitcoin"));
        blockchain.addBlock(blockchain.newBlock("Alex"));
        blockchain.addBlock(blockchain.newBlock("https://wwww.bitcoin.com"));

        System.out.println("Is blockchain valid? : " + blockchain.isBlockChainValid());
        System.out.println(blockchain);

        // adding an invalid block to corrupt Blockchain
        blockchain.addBlock(new Block(15, System.currentTimeMillis(), "aaaabbb", "Block invalid"));

        System.out.println("Is blockchain valid? : " + blockchain.isBlockChainValid());
    }
}
