class NamedCow extends Cow
{
  private String myCowName;
  public NamedCow(String type, String CowName, String sound)
  {
    myType = type;
    myCowName = CowName;
    mySound = sound;
  }
  public String getName()
  {
    return myCowName;
  }
}
