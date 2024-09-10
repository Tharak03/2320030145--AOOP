package auction;

public abstract class AuctionProcessTemplate {

    public final void conductAuction() {
        announceAuction();
        startBidding();
        endBidding();
        declareWinner();
    }

    protected abstract void announceAuction();

    protected abstract void startBidding();

    protected abstract void endBidding();

    protected abstract void declareWinner();
}
