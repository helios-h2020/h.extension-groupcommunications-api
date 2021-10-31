package eu.h2020.helios_social.modules.groupcommunications.api.group;


public class CustomButton {
    CustomButtonListener ml;

    // constructor
    public CustomButton(CustomButtonListener ml) {
        //Setting the listener
        this.ml = ml;
    }

/*    public void MyLogicToIntimateOthers() {
        //Invoke the interface
        ml.onButtonClickListener(this, "success");
    }*/
}