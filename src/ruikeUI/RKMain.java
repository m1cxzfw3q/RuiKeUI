package ruikeUI;

import arc.Core;
import arc.Graphics;
import arc.graphics.Color;
import arc.graphics.Pixmap;
import arc.util.Log;
import mindustry.Vars;
import mindustry.mod.Mod;

public class RKMain extends Mod {
    public RKMain() {
        // 替换鼠标贴图
        Log.log(Log.LogLevel.info, "[RuiKeUI]替换鼠标贴图");
        Vars.ui.drillCursor = Core.graphics.newCursor(
                new Pixmap(Vars.tree.get("cursors/drill.png")), 1, Color.valueOf("3f3f3fff"), 1
        );

        Vars.ui.repairCursor = Core.graphics.newCursor(
                new Pixmap(Vars.tree.get("cursors/repair.png")), 1, Color.valueOf("3f3f3fff"), 1
        );

        Vars.ui.unloadCursor = Core.graphics.newCursor(
                new Pixmap(Vars.tree.get("cursors/unload.png")), 1, Color.valueOf("3f3f3fff"), 1
        );

        Vars.ui.targetCursor = Core.graphics.newCursor(
                new Pixmap(Vars.tree.get("cursors/target.png")), 1, Color.valueOf("3f3f3fff"), 1
        );

        Graphics.Cursor.SystemCursor.arrow.set(
                Core.graphics.newCursor(
                        new Pixmap(Vars.tree.get("cursors/cursor.png")), 1, Color.valueOf("3f3f3fff"), 1
                )
        );

        Graphics.Cursor.SystemCursor.hand.set(
                Core.graphics.newCursor(
                        new Pixmap(Vars.tree.get("cursors/hand.png")), 1, Color.valueOf("3f3f3fff"), 1
                )
        );

        Graphics.Cursor.SystemCursor.ibeam.set(
                Core.graphics.newCursor(
                        new Pixmap(Vars.tree.get("cursors/ibeam.png")), 1, Color.valueOf("3f3f3fff"), 1
                )
        );
    }
}
