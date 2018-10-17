class Chick implements Animal {
     private String myType;
     private String mySound;
     public Chick(String type, String sound, String othersound) {
       myType = type;
       if (Math.random() >= .5)
       mySound = othersound;
       else
       mySound = sound;
 
     }
     public Chick() {
         myType = "unknown";
         mySound = "unknown";
     }
     public String getSound(){return mySound;}
     public String getType(){return myType;}
}
