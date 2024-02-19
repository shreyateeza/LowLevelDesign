package LLD2.Factory;

import LLD2.Factory.components.button.AndroidButton;
import LLD2.Factory.components.button.Button;
import LLD2.Factory.components.dropdown.AndroidDropDown;
import LLD2.Factory.components.dropdown.DropDown;
import LLD2.Factory.components.menu.AndroidMenu;
import LLD2.Factory.components.menu.Menu;

public class AndroidFactory implements UIFactory{
    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public DropDown createDropDown() {
        return new AndroidDropDown();
    }
}
