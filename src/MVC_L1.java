public class MVC_L1 {
    public static void main(String[] args) {
        xModel modell = cobaData();

        xView view = new xView();

        xController controll = new xController(modell, view);
        
        controll.updateView();

        controll.setNama("Gelis");

        controll.updateView();
    }

    private static xModel cobaData() {
        xModel model = new xModel();
        model.setNama("Joko");
        model.setNim("672018999");
        return model;
    }
}
