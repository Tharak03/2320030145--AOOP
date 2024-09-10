package auction;

public class ReserveAuction extends AuctionProcessTemplate {
    private Auctioneer auctioneer;
    private int reservePrice = 130;  // Example reserve price

    public ReserveAuction(Auctioneer auctioneer) {
        this.auctioneer = auctioneer;
    }

    @Override
    protected void announceAuction() {
        auctioneer.notifyBidders("A reserve auction has been announced.");
    }

    @Override
    protected void startBidding() {
        auctioneer.notifyBidders("Bidding has started for the reserve auction.");

        // Simulate bids
        auctioneer.placeBid("Alice", 120);
        auctioneer.placeBid("Bob", 140);
        auctioneer.placeBid("Charlie", 110);
    }

    @Override
    protected void endBidding() {
        auctioneer.notifyBidders("Bidding has ended for the reserve auction.");
    }

    @Override
    protected void declareWinner() {
        String winner = auctioneer.determineWinner();

        // Find the highest bid associated with the winner
        int highestBid = winner != null && auctioneer.getBids().containsKey(winner)
                ? auctioneer.getBids().get(winner)
                : 0;

        if (highestBid >= reservePrice) {
            auctioneer.notifyBidders("The winner of the reserve auction is " + winner + " with a bid of $" + highestBid + ".");
        } else {
            auctioneer.notifyBidders("No winner. The reserve price was not met.");
        }
    }
}
