package com.cgwx.data.dto;

import java.util.List;

public class SecondaryFileStructure {

    private List<String> file;

    private List<DirectoryInfo> directory;

    public List<String> getFile() {
        return file;
    }

    public void setFile(List<String> file) {
        this.file = file;
    }

    public List<DirectoryInfo> getDirectory() {
        return directory;
    }

    public void setDirectory(List<DirectoryInfo> directory) {
        this.directory = directory;
    }
}
