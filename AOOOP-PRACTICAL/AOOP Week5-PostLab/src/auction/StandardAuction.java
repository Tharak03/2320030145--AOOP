package auction;

public class StandardAuction extends AuctionProcessTemplate {
    private Auctioneer auctioneer;

    public StandardAuction(Auctioneer auctioneer) {
        this.auctioneer = auctioneer;
    }

    @Override
    protected void announceAuction() {
        auctioneer.notifyBidders("A standard auction has been announced.");
    }

    @Override
    protected void startBidding() {
        auctioneer.notifyBidders("Bidding has started for the standard auction.");

        // Simulate bids
        auctioneer.placeBid("Alice", 100);
        auctioneer.placeBid("Bob", 150);
        auctioneer.placeBid("Charlie", 120);
    }

    @Override
    protected void endBidding() {
        auctioneer.notifyBidders("Bidding has ended for the standard auction.");
    }

    @Override
    protected void declareWinner() {
        String winner = auctioneer.determineWinner();
        auctioneer.notifyBidders("The winner of the standard auction is " + winner + ".");
    }
}
