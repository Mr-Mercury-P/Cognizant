public class RemoteControl {
    private Command obj;
    public void setObj(Command obj)
    {
        this.obj = obj;
    }
    public void button()
    {
        obj.execute();
    }
}
