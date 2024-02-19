package LLD2.Factory;

import LLD2.Factory.AndroidFactory;
import LLD2.Factory.Flutter;
import LLD2.Factory.SupportedPlatform;
import LLD2.Factory.UIFactory;
import LLD2.Factory.components.button.Button;
import LLD2.Factory.components.dropdown.DropDown;
import LLD2.Factory.components.menu.Menu;

public class Main {
    public static void main(String[] args) {
        Flutter flutter = new Flutter(SupportedPlatform.MAC);
        UIFactory factory = flutter.createUIFactory();
        Menu menu = factory.createMenu();
        Button button = factory.createButton();
        DropDown dropDown = factory.createDropDown();
    }
}
