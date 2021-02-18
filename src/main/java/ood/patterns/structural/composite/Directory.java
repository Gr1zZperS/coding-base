package ood.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory extends  FileSystemObject {

    private final List<FileSystemObject> files;

    public Directory() {
        files = new ArrayList<>();
    }

    @Override
    int size() {
        int total = 0;
        for(FileSystemObject systemObject: files) {
            total += systemObject.size();
        }
        return total;
    }

    public void addObject(FileSystemObject systemObject) {
        files.add(systemObject);
    }

}
