public class xController {
    private xModel model;
    private xView view;

    public xController(xModel modell, xView vieww) {
        this.model = modell;
        this.view = vieww;
    }

    public void setNama(String nama) {
        model.setNama(nama);
    }

    public String getNama() {
        return this.getNama();
    }

    public void setNim(String nim) {
        model.setNim(nim);
    }

    public void updateView() {
        view.showX(model.getNama(), model.getNim());
    }
}