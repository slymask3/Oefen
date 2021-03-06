package com.abstractlabs.oefen.map;

public class Tile {
	public static int NULL = -1;
	public static int GRASS = 0;
	public static int GRASS_FLOWER = 20;
	public static int PATH_HORIZONTAL = 1;
	public static int PATH_VERTICAL = 30;
	public static int PATH_BOTTOM_RIGHT = 2;
	public static int PATH_TOP_LEFT = 3;
	public static int PATH_TOP_RIGHT = 4;
	public static int PATH_BOTTOM_LEFT = 5;
	public static int BRIDGE = 6;
	public static int BRIDGE2 = 10;
	public static int WATER = 7;
	public static int WATER_LEFT = 8;
	public static int WATER_RIGHT = 9;
	public static int WATER_TOP = 60;
	public static int WATER_BOTTOM = 61;
	public static int WATER_TOPLEFT_CORNER = 62;
	public static int WATER_TOPRIGHT_CORNER = 63;
	public static int WATER_BOTTOMLEFT_CORNER = 64;
	public static int WATER_BOTTOMRIGHT_CORNER = 65;
	public static int GEM_BLUE = 11;
	public static int GEM_GREEN = 12;
	public static int GEM_GRAY = 13;
	public static int GEM_PURPLE = 14;
	public static int GEM_RED = 15;
	public static int GEM_ORANGE = 16;
	public static int STONE = 40;
	public static int BRIDGE_STONE_HORIZONTAL = 1;
	public static int BRIDGE_STONE_VERTICAL = 30;
	public static int BRIDGE_STONE_BOTTOM_RIGHT = 2;
	public static int BRIDGE_STONE_TOP_LEFT = 3;
	public static int BRIDGE_STONE_TOP_RIGHT = 4;
	public static int BRIDGE_STONE_BOTTOM_LEFT = 5;

	public static int TOWER_BLUE_ALLOWED = 0;
	public static int TOWER_BLUE_TAKEN = 1;
	public static int TOWER_NOTALLOWED = 2;
	public static int TOWER_RED_ALLOWED = 9;
	public static int TOWER_RED_TAKEN = 8;

	public static int PATH_GO = 1;
//	public static int PATH_TURN_UP = 2;
//	public static int PATH_TURN_RIGHT = 3;
//	public static int PATH_TURN_DOWN = 4;
//	public static int PATH_TURN_RIGHT2 = 1;
}