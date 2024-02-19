package LLD2.Factory;

import LLD2.Factory.components.button.Button;
import LLD2.Factory.components.button.MacButton;
import LLD2.Factory.components.dropdown.DropDown;
import LLD2.Factory.components.dropdown.MacDropDown;
import LLD2.Factory.components.menu.MacMenu;
import LLD2.Factory.components.menu.Menu;

public class MacFactory implements UIFactory{
    @Override
    public Menu createMenu() {
        return new MacMenu();
    }

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public DropDown createDropDown() {
        return new MacDropDown();
    }
}
