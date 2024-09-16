public class History {

    private Navigation navigation;
    private int sizer;
    private int sizeMax;


    public History() {
        this.navigation = null;
        this.sizer = 0;
        this.sizeMax = 10;
    }

    public void  addUrl(String url){

        Navigation n = new Navigation(url);

        if(this.navigation == null){
            this.navigation = n;
        }else {
            Navigation temp = this.navigation;
            while(temp.getNext() != null){
                temp = temp.getNext();
            }
            temp.setNext(n);
        }
        this.sizer++;
        System.out.println("Adicionado");
        if(this.sizer > this.sizeMax){
            removeUrl();
        }

    }

    private void removeUrl (){

        if(this.navigation == null) return;

        if(this.navigation.getNext() == null){
            this.navigation = null;
        }else {
            Navigation temp = this.navigation;
            while(temp.getNext() != null){
                temp = temp.getNext();
            }
            temp.setNext(null);
        }
        this.sizer--;
    }

    public void getNavigation(){
        Navigation n = this.navigation;
        if(n == null){
            System.out.println("Historico Vazio");
        }
        while(n != null){
                System.out.println(n.getUrl());
                n = n.getNext();
        }
    }
}