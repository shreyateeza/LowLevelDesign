package LLD2.Factory;

import LLD2.Factory.components.button.Button;
import LLD2.Factory.components.dropdown.DropDown;
import LLD2.Factory.components.menu.Menu;

public interface UIFactory {
    Menu createMenu();
    Button createButton();
    DropDown createDropDown();
}
