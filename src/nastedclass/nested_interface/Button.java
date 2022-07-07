package nastedclass.nested_interface;

public class Button {
    OnclickLsitener listener;

    void setListener(OnclickLsitener listener) {
        this.listener = listener;
    }

    void touch() {
        listener.onClick();
    }

    interface OnclickLsitener {
        void onClick();
    }

}


