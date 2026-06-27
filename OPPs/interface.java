interface Swim  {
    void swim();
}
interface Fly {
    void fly();
}
class Duck implements Swim,Fly{
    @Override
    public void swim(){
        System.out.println("Duck is Swimming");
    }
    @Override
    public void fly(){
        System.out.println("Duck is Flying");
    }
}
