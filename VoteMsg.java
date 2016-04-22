public class VoteMsg{
  private boolean isRequest;
  private boolean isVote;
  private int     candidateID;
  private int     voteCount;

  public VoteMsg(boolean isRequest, boolean isVote, int candidateID, int voteCount){
    if(voteCount != 0 && isRequest){
      throw new IllegalArgumentException("Request can't have vote counte != 0");
    }
    this.isRequest   = isRequest;
    this.isVote      = isVote;
    this.candidateID = candidateID;
    this.voteCount   = voteCount;
  }

  // when isRequest flag is 1 the message is a request
  public boolean isRequest(){
    return this.isRequest;
  }

  // when isRequest flag is 0 the message is a response 
  public boolean isResponse(){
    return !this.isRequest;
  }
  
  public void    setRequest(boolean req){ this.isRequest = req; }

  public boolean isVote(){ return this.isVote; }
  public void    setVote(boolean vote){ this.isVote = vote; }

  public int     getCandidateID(){ return this.candidateID; }
  public void    setCandidateID(int id){ this.candidateID = id; }

  public int     getVoteCount(){ return this.voteCount; }
  public void    setVoteCount(int count){ this.voteCount = count; }

  public String toString(){return "";}
}
