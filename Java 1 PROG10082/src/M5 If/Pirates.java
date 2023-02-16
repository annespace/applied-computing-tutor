public class Pirates
{
    public static void main (String[] args)
    {
        /*
we should only be able to shoot the pistol if we have bullets.
we want to limit the number of bullets that a Pirate can have at any one time to 3
we should only be able to shoot the pistol if our pirate has less than 2 eye patches
we want to be able to reload our pistol
         */
        Pirate pirate1 = new Pirate();
        pirate1.name = "Jack Sparrow";
        pirate1.numEyePatches = 0;
        pirate1.shootPistol();
        pirate1.shootPistol();
        pirate1.shootPistol();
        pirate1.shootPistol();
        pirate1.reloadGun();
        pirate1.shootPistol();

        Pirate pirate2 = new Pirate();
        pirate2.name = "Redbeard";
        pirate2.numEyePatches = 1;
        pirate2.shootPistol();
        pirate2.shootPistol();
        pirate2.shootPistol();
        pirate2.shootPistol();
    }
}