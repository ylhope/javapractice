package votesystem;

public class Operate {
    Person p[] = new Person[]{new Person(1,"张三",0),new Person(2,"李四",0),new Person(3,"王五",0),new Person(4,"赵六",0)};
    boolean b = true;
    public Operate(){
        System.out.println("现在根据民主投票方式选班长。");
        System.out.println("这里有四个候选人，他们分别是1号张三、2号李四、3号王五、4号赵六。");
        System.out.println("如果你支持谁，请输入这个人的编号：");
        introdece();
        while(b) {
            Input input = new Input();
            int codename = input.getInput();
            vote(codename);
        }
        introdece();
        System.out.println("投票最终结果："+p[max(p)].name+"，最后以"+p[max(p)].vodenum+"票当选班长");
    }

    private int max(Person[] p) {
        if (p[0].vodenum>p[1].vodenum && p[0].vodenum>p[2].vodenum && p[0].vodenum>p[3].vodenum)
            return 0;
        if (p[1].vodenum>p[0].vodenum && p[1].vodenum>p[2].vodenum && p[1].vodenum>p[3].vodenum)
            return 1;
        if (p[2].vodenum>p[0].vodenum && p[2].vodenum>p[1].vodenum && p[2].vodenum>p[3].vodenum)
            return 2;
        return 3;
    }

    private void vote(int codename) {
        switch (codename){
            case 0:{
                b = false;
                break;
            }case 1:{
                p[0].vodenum++;
                break;
            }case 2:{
                p[1].vodenum++;
                break;
            }case 3:{
                p[2].vodenum++;
                break;
            }case 4:{
                p[3].vodenum++;
                break;
            }default:{
                System.out.println("此选票无效，请输入正确的候选人代号！");
            }
        }
    }

    void introdece(){
        System.out.println(p[0].codename+":"+p[0].name+" "+"【"+p[0].vodenum+"】");
        System.out.println(p[1].codename+":"+p[1].name+" "+"【"+p[1].vodenum+"】");
        System.out.println(p[2].codename+":"+p[2].name+" "+"【"+p[2].vodenum+"】");
        System.out.println(p[3].codename+":"+p[3].name+" "+"【"+p[3].vodenum+"】");
    }

}
