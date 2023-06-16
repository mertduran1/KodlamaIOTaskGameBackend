public class Campaign implements Entity {
    private int id;
    private String campaignName;
    private int percentInDiscount;


    public Campaign(int id, String campaignName, int percentInDiscount) {
        this.id = id;
        this.campaignName = campaignName;
        this.percentInDiscount = percentInDiscount;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public int getPercentInDiscount() {
        return percentInDiscount;
    }

    public void setPercentInDiscount(int percentInDiscount) {
        this.percentInDiscount = percentInDiscount;
    }

}
