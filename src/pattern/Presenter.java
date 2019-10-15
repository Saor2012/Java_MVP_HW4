package pattern;

public class Presenter implements Compare.Presenter {
    private Compare.View view;
    //@Override
    public void init(Compare.View view) { this.view = view; }
    //@Override
    public void duckName(pattern.View.CallBack callback) { //pattern.View.CallBack callBack
        Duck.getInstance().setName("Bob");
        //callBack.message(Duck.getInstance().getName());
        view.print(Duck.getInstance().getName());
        //callBack.message();
    }
    public void calculateFunction() {
        Calculator.getInstance().Init();
    }
    public void message(String str) {
        view.print(str);
    }
}