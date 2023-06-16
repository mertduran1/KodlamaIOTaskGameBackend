public class CampaingManager implements CampaignService {
    @Override
    public void add(Campaign campaign) {
        System.out.println("Campaign Added With Discount Of: " + campaign.getPercentInDiscount() + " and the name of : " + campaign.getCampaignName());
    }
    @Override
    public void update(Campaign campaign) {
        System.out.println("Campaign Updated With Discount Of : " + campaign.getPercentInDiscount() + " and the name of : " + campaign.getCampaignName());
    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println("Campaign Deleted With Discound Of : "  + campaign.getCampaignName() + " and the name of : "  + campaign.getCampaignName());
    }
}
