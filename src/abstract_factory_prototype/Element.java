package abstract_factory_prototype;

public interface Element {

    void paint();

    interface Button extends Element {}

    interface Checkbox extends Element {}

    interface ProgressBar extends Element {}

    class WinLightButton implements Button {

        @Override
        public void paint() {
            System.out.println("Rendering a square light Windows Button.");
        }
    }

    class WinLightCheckbox implements Checkbox {

        @Override
        public void paint() {
            System.out.println("Rendering a light Windows Checkbox.");
        }
    }

    class WinLightProgressBar implements ProgressBar {

        @Override
        public void paint() {
            System.out.println("Rendering a light Windows progress bar.");
        }
    }

    class WinDarkButton implements Button {

        @Override
        public void paint() {
            System.out.println("Rendering a dark square Windows Button.");
        }
    }

    class WinDarkCheckbox implements Checkbox {

        @Override
        public void paint() {
            System.out.println("Rendering a dark Windows Checkbox.");
        }
    }

    class WinDarkProgressBar implements ProgressBar {

        @Override
        public void paint() {
            System.out.println("Rendering a dark Windows progress bar.");
        }
    }

    class MacLightButton implements Button {

        @Override
        public void paint() {
            System.out.println("Rendering a light round Mac Button.");
        }
    }

    class MacLightCheckbox implements Checkbox {

        @Override
        public void paint() {
            System.out.println("Rendering a light Mac Checkbox.");
        }
    }

    class MacLightProgressBar implements ProgressBar {

        @Override
        public void paint() {
            System.out.println("Rendering a light Mac progress bar.");
        }
    }

    class MacDarkButton implements Button {

        @Override
        public void paint() {
            System.out.println("Rendering a dark round Mac Button.");
        }
    }

    class MacDarkCheckbox implements Checkbox {

        @Override
        public void paint() {
            System.out.println("Rendering a dark Mac Checkbox.");
        }
    }

    class MacDarkProgressBar implements ProgressBar {

        @Override
        public void paint() {
            System.out.println("Rendering a dark Mac progress bar.");
        }
    }

    class LinuxLightButton implements Button {

        @Override
        public void paint() {
            System.out.println("Rendering a light Linux Button.");
        }
    }

    class LinuxLightCheckbox implements Checkbox {

        @Override
        public void paint() {
            System.out.println("Rendering a light Linux Checkbox.");
        }
    }

    class LinuxLightProgressBar implements ProgressBar {

        @Override
        public void paint() {
            System.out.println("Rendering a light Linux progress bar.");
        }
    }

    class LinuxDarkButton implements Button {

        @Override
        public void paint() {
            System.out.println("Rendering a dark Linux Button.");
        }
    }

    class LinuxDarkCheckbox implements Checkbox {

        @Override
        public void paint() {
            System.out.println("Rendering a dark Linux Checkbox.");
        }
    }

    class LinuxDarkProgressBar implements ProgressBar {

        @Override
        public void paint() {
            System.out.println("Rendering a dark Linux progress bar.");
        }
    }
}
