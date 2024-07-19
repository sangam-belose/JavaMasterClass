package com.practice.designpattern.structural;

import java.util.ArrayList;
import java.util.List;

public class CompositePatternExample {

	public static void main(String[] args) {

		FileSystemItem file1 = new File("abc.txt");
		FileSystemItem file2 = new File("sample.pdf");
		FileSystemItem file3 = new File("cal.csv");

		Directory dir1 = new Directory("accounts");
		dir1.add(file1);
		dir1.add(file2);
		Directory dir2 = new Directory("sales");
		dir2.add(file3);

		// create root directory

		Directory root = new Directory("root");
		root.add(dir1);
		root.add(dir2);

		root.print("");
	}
}

interface FileSystemItem {
	void print(String indent);
}

class File implements FileSystemItem {

	private String name;

	public File(String name) {
		this.name = name;
	}

	@Override
	public void print(String indent) {
		System.out.println(indent + "File: " + name);
	}
}

class Directory implements FileSystemItem {
	private String name;
	private List<FileSystemItem> items = new ArrayList<>();

	public Directory(String name) {
		this.name = name;
	}

	public void add(FileSystemItem item) {
		this.items.add(item);
	}

	public void remove(FileSystemItem item) {
		this.items.remove(item);
	}

	@Override
	public void print(String indent) {
		System.out.println(indent + "Directory: " + name);
		for (FileSystemItem item : items) {
			item.print(indent + " ");
		}
	}
}