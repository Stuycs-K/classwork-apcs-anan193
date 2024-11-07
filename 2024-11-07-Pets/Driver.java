//After overriding the getName method, only the birds changed the way they spoke
//The animal objects that were not birds had the same getName method
//Even though we only overrode the getName method, we changed the speak method
//The Bird b2 = new Animal(...) didn't work because the Bird is a subclass of Animal
//This lines up with the is-A relationship because bird can be used as an animal, but
//animal cannot be used as a bird


public class Driver{
  public static void main(String[]args) {

    Animal puppy = new Animal("Arf", 3, "Fido");
    puppy.speak();

    Bird bluejay = new Bird("caw caw", 5, "Mordecai", 72, "blue");
    bluejay.speak();


    Animal raccoon = new Animal("Screech", 4, "Rigby");
    raccoon.speak();

    Bird parrot = new Bird("Squeek", 6, "Floppy", 43, "rainbow");
    parrot.speak();

    //Bird duck = new Animal("Quack", 3, "Shloom");

    Animal crane = new Bird("Coo coo", 19, "Longy", 42, "black");
    crane.speak();
  }
}
