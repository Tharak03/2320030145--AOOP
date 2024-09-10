package auction;

public class AuctionDemo {
    public static void main(String[] args) {
        // Create Auctioneer (Subject)
        Auctioneer auctioneer = new Auctioneer();

        // Create Bidders (Observers)
        Bidder bidder1 = new Bidder("Alice");
        Bidder bidder2 = new Bidder("Bob");
        Bidder bidder3 = new Bidder("Charlie");

        // Subscribe bidders to the auction
        auctioneer.subscribe(bidder1);
        auctioneer.subscribe(bidder2);
        auctioneer.subscribe(bidder3);
        System.out.println();

        // Conduct a Standard Auction
        StandardAuction standardAuction = new StandardAuction(auctioneer);
        System.out.println("=== Standard Auction ===");
        standardAuction.conductAuction();
        System.out.println();  

        // Conduct a Reserve Auction
        ReserveAuction reserveAuction = new ReserveAuction(auctioneer);
        System.out.println("=== Reserve Auction ===");
        reserveAuction.conductAuction();
        System.out.println();  

        // Unsubscribe a bidder
        auctioneer.unsubscribe(bidder2);
        System.out.println();
    }
}
