package growingsoftware.e2e;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import growingsoftware.ApplicationRunner;
import growingsoftware.FakeAuctionServer;

public class AuctionSniperEndToEndTest {

    private final FakeAuctionServer auction = new FakeAuctionServer("item-54321");
    private final ApplicationRunner application = new ApplicationRunner();
    
    @Test
    public void sniperJoinsAuctionUntilAuctionClose() throws Exception {
        auction.startSellingItem();
        application.startBiddingIn(auction);
        auction.hasReceivedJoinRequestFromSniper();
        auction.announceClosed();
        application.showSniperHasLostAuction();
    }

    @AfterEach
    public void stopAuction(){

    }

    @AfterEach
    public void stopApplication(){

    }
}
