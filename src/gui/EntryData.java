package gui;

public enum EntryData {

    CONSTRUCTION("Construction_icon.png","Construction",
        new String[] {}
    ),
    HITPOINTS("Hitpoints_icon.png","Hitpoints",
        new String[] {"hello"}
    ),
    HUNTER("","Hunter",
        new String[] {"hi","there"}
    );

    static EntryData[] ENTRIES = {CONSTRUCTION,HITPOINTS,HUNTER};

    final String ICON_PATH;
    final String TITLE;
    final String[] DESCRIPTION;

    EntryData(String iconPath, String title, String[] description){
        this.ICON_PATH = iconPath;
        this.TITLE = title;
        this.DESCRIPTION = description;
    }

}
