public void setup()
{
  Chick h = new Chick("chick","bok", "chirp");
  System.out.println(h.getType() + " goes " + h.getSound());
  Cow c = new Cow("cow", "moo");
  System.out.println(c.getType() + " goes " + c.getSound());
  NamedCow n = new NamedCow("cow","Lasagna","moo");
  System.out.println("The cow is known as " + n.getName());
  Pig p = new Pig("pig", "oink");
  System.out.println(p.getType() + " goes " + p.getSound());
}
