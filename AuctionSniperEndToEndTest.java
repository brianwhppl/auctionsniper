
public class void AuctionSniperEndtoEndTest {
   private final FakeAuctionServer auction = new FakeAuctionServer("item-54321");
   private final APplicationRunner application = new ApplicationRunner();

   @Test
   public void sniperJoinsAuctionUntilAuctionCloses() throws Exception {
   }

   // Additional cleanup
   @After
   public void stopAuction() {
      auction.stop();
   }
   @After
   public void stopApplication() {
      application.stop();
   }
}