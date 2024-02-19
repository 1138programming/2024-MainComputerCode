package MainComputerCode;

import com.raylib.java.Raylib;
import com.raylib.java.core.*;
import com.raylib.java.shapes.Rectangle;

public class GUI {

    public static void draw() {
        Raylib rlj = new Raylib();
        rlj.core.InitWindow(800, 600, "Raylib-J Example");
        Rectangle text_box= new Rectangle(200f, 200f,300.0f,100.0f);
        rlj.core.SetTargetFPS(20);
        int key;
        char[] text1 =new char[10];

        boolean mouseover = false;

        int i=0;
        while (!rlj.core.WindowShouldClose()){
            key = rlj.core.GetCharPressed();            

            if (rlj.shapes.CheckCollisionPointRec(rlj.core.GetMousePosition(), text_box))
            {
                mouseover = true;
            }
            else {
                mouseover = false;
            }         
            // System.out.println(mouseover);
            while (key > 0) {            
                key = rlj.core.GetKeyPressed();


                // NOTE: Only allow keys in range [32..125]
                if       (i < 10)              {
                    text1[i] = (char)key;
                    i++;
                }                
                 // Check next character in the queue


            }

            for (int j =0; j< text1.length;j++) {
                System.out.println(text1[j]);
            }
            
            String text2 = new String(text1);
            rlj.core.BeginDrawing();
            rlj.text.DrawText("PLACE MOUSE OVER INPUT BOX!", 240, 140, 20,  Color.GRAY);
            rlj.shapes.DrawRectangleRec(text_box, Color.LIGHTGRAY);
            rlj.shapes.DrawRectangleLines((int)text_box.x, (int)text_box.y, (int)text_box.width, (int)text_box.height, Color.RED);

            rlj.text.DrawText(text2, (int)text_box.x + 5, (int)text_box.y + 8, 40, Color.MAROON);

            rlj.core.ClearBackground(Color.WHITE);
            rlj.core.EndDrawing();

        }
            
        }
    }
    


