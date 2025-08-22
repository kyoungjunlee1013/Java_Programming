package main.java.nestedinterface2;

public class Button {
    public static interface ClickListener{
        void onClick();
    }
        private ClickListener clickListener;

        public void setClickListener(ClickListener clickListener){
            this.clickListener = clickListener;
        }
}
