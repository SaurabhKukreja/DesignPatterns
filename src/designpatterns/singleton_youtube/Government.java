package designpatterns.singleton_youtube;

public class Government {

  private String rulingParty;
  private int majorityVotes;

  private static Government government = new Government();

  private Government() {
    System.out.println("Instance Created");
  }

  public String getRulingParty() {
    return rulingParty;
  }

  public int getMajorityVotes() {
    return majorityVotes;
  }

  public static Government getInstance() {
    return government;
  }

}
