package vol1.ch12_interface_abstract_enum;

public abstract class MemberManagerAbstract {
  public abstract boolean addMember(MemberDTO member);

  public abstract boolean removeMember(MemberDTO member);

  public abstract boolean updateMember(MemberDTO member);

  public final void printLog(String data) {
    System.out.println("Data = " + data);
  }
}
