public class Pirate {

    public String name;
    public int numEyePatches;
    private int numBullets = 3;

    public void shootPistol (){
        if(numEyePatches > 1 || numEyePatches < 0 ){
            return ;
        }
        // else {
        //     if(numBullets > 0) {
        //         System.out.println(name + ": SHOOT!");
        //         numBullets--;
        //     }
        //    else
        //     {
        //         System.out.println(name + ": .........");
        //     }
        // }
        else{
            fire();
        }
    }

    public void fire(){
        if(numBullets > 0) {
            System.out.println(name + ": SHOOT!");
            numBullets--;
        }
        else
        {
            System.out.println(name + ": .........");
        }
    }

    public void reloadGun (){
        numBullets=3;
    }
}