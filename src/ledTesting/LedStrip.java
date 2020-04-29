package ledTesting;

 class LedStrip {
    private Led[] led;
    private int counter;


    public LedStrip(Led[] led) {
        this.led = led;
    }

    public int noOfStrips() {
        return led.length;
    }


    private int WorkingLeds(){
        for (int i = 0; i <noOfStrips(); i++) {
            if(led[i].getWorking().equals("yes")){
                counter++;
            }
        }
        return counter;
    }
    public void stripStatus(){
        if(WorkingLeds()>(noOfStrips()/2)){
            System.out.println("Strip is not defective");
        }
        else{
            System.out.println("Strip is defective");
        }
    }


    }
