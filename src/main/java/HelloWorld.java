public class HelloWorld {
    public  static void main(String[] args){
        PersonOuterClass.Person person = PersonOuterClass.Person.newBuilder().setName("Jailson").setAge(32).build();
        System.out.println(person.toString());

    }
}
