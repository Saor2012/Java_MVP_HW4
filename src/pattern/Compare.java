package pattern;

public interface Compare {
    interface View {
        void init();
        void print(String message);
        void event();
    }
    interface Presenter {
        void init(Compare.View view);
        void duckName(pattern.View.CallBack callback); //test.pattern.View.CallBack.callBack
        void calculateFunction();
    }
    interface CallBack {
        void message(String message);
    }
}