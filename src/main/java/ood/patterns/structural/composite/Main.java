package ood.patterns.structural.composite;

public class Main {

    private static Directory subdir() {
        Directory directory = new Directory();
        directory.addObject(new File());
        directory.addObject(new File());
        return directory;
    }

    public static void main(String[] args) {
        Directory root = new Directory();
        root.addObject(subdir());
        root.addObject(new File());

        System.out.println("Sie of directory: " + root.size());
    }

}
