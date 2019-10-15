package pattern;

public class View implements Compare.View {
    private Compare.Presenter presenter;
    @FunctionalInterface
    interface CallBack { void message(String message); }
    public View() { presenter = new Presenter(); }
    //@Override
    public void init() { presenter.init(this); }
    //@Override
    public void print(String message) { System.out.println(message); }
    //@Override
    public void event() { presenter.duckName(System.out::println); }//System.out::println
}