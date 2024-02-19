package LLD2.Factory;

import LLD2.Factory.UIFactory;
import LLD2.Factory.components.button.Button;
import LLD2.Factory.components.button.IOSButton;
import LLD2.Factory.components.dropdown.DropDown;
import LLD2.Factory.components.dropdown.IOSDropDown;
import LLD2.Factory.components.menu.IOSMenu;
import LLD2.Factory.components.menu.Menu;

public class IOSFactory implements UIFactory {
    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }

    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public DropDown createDropDown() {
        return new IOSDropDown();
    }
}
