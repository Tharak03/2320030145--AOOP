package auction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Auctioneer {
    private Map<String, Integer> bids = new HashMap<>();
    private List<AuctionEvent> bidders = new ArrayList<>();

    public void subscribe(AuctionEvent bidder) {
        bidders.add(bidder);
        System.out.println(((Bidder) bidder).getName() + " has subscribed to the auction.");
    }

    public void unsubscribe(AuctionEvent bidder) {
        bidders.remove(bidder);
        System.out.println(((Bidder) bidder).getName() + " has unsubscribed from the auction.");
    }

    public void notifyBidders(String message) {
        for (AuctionEvent bidder : bidders) {
            bidder.update(message);
        }
    }

    public void placeBid(String bidderName, int bidAmount) {
        bids.put(bidderName, bidAmount);
        System.out.println(bidderName + " has placed a bid of $" + bidAmount);
    }

    public String determineWinner() {
        String winner = null;
        int highestBid = 0;

        for (Map.Entry<String, Integer> entry : bids.entrySet()) {
            if (entry.getValue() > highestBid) {
                highestBid = entry.getValue();
                winner = entry.getKey();
            }
        }
        return winner != null ? winner : "No bids placed";
    }

    public Map<String, Integer> getBids() {
        return bids;
    }
}
