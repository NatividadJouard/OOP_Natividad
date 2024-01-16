/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package runquad;

/**
 *
 * @author 
 */
public class Quadrilateral {
    public void showDescription() {
        System.out.println("- is a quadrilateral");
    }
}

    class Parallelogram extends Quadrilateral {
        @Override
        public void showDescription() {
            super.showDescription();
            System.out.println("- has 2 pairs of parallel sides");
        }
    }

        class Rectangle extends Parallelogram {
            @Override
            public void showDescription() {
                super.showDescription();
                System.out.println("- has 4 right angles");
            }
        }

            class Square extends Rectangle {
                @Override
                public void showDescription() {
                    super.showDescription();
                    System.out.println("- has 4 equal sides");
                }
            }

                class Rhombus extends Parallelogram {
                    @Override
                    public void showDescription() {
                        super.showDescription();
                        System.out.println("- has 4 congruent sides");
                    }
                }

                    class Trapezoid extends Quadrilateral {
                        @Override
                        public void showDescription() {
                            super.showDescription();
                            System.out.println("- has 1 pair of parallel sides");
                        }
                    }
