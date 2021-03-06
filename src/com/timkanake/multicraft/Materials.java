package com.timkanake.multicraft;

import java.util.HashMap;

public class Materials {
	
	private static Materials instance = null;
	static HashMap<String, Integer> materials = null;
	
	private Materials() {
		materials = initializeMaterialsDict();
	}
	
	public static Materials getInstance() {
		if(instance == null) {
			instance = new Materials();
		}
		return instance;
	}
	
	@SuppressWarnings("static-access")
	public static int getId(String s) throws MaterialDoesNotExistException {		
		if(! getInstance().materials.containsKey(s.toLowerCase())) {
			throw new MaterialDoesNotExistException("The material you requested does not exits");
		}
		return materials.get(s);
	}
	
	@SuppressWarnings("serial")
	public static HashMap<String, Integer> initializeMaterialsDict(){
		 return new HashMap<String, Integer>(){{
			put("air",0);
			put("stone",1);
			put("grass",2);
			put("dirt",3);
			put("cobblestone",4);
			put("oak wood plank",5);
			put("oak sapling",6);
			put("Bedrock",7);
			put("Flowing Water",8);
			put("Still Water",9);
			put("Flowing Lava",10);
			put("Still Lava",11);
			put("Sand",12);
			put("Gravel",13);
			put("Gold Ore",14);
			put("Iron Ore",15);
			put("Coal Ore",16);
			put("Oak Wood",17);
			put("Oak Leaves",18);
			put("Sponge",19);
			put("Glass",20);
			put("Lapis Lazuli Ore",21);
			put("Lapis Lazuli Block",22);
			put("Dispenser",23);
			put("Sandstone",24);
			put("Note Block",25);
			put("Bed",26);
			put("Powered Rail",27);
			put("Detector Rail",28);
			put("Sticky Piston",29);
			put("Cobweb",30);
			put("Dead Shrub",31);
			put("Dead Bush",32);
			put("Piston",33);
			put("Piston Head",34);
			put("White Wool",35);
			put("Dandelion",37);
			put("Poppy",38);
			put("Brown Mushroom",39);
			put("Red Mushroom",40);
			put("Gold Block",41);
			put("Iron Block",42);
			put("Double Stone Slab",43);
			put("Stone Slab",44);
			put("Bricks",45);
			put("TNT",46);
			put("Bookshelf",47);
			put("Moss Stone",48);
			put("Obsidian",49);
			put("Torch",50);
			put("Fire",51);
			put("Monster Spawner",52);
			put("Oak Wood Stairs",53);
			put("Chest",54);
			put("Redstone Wire",55);
			put("Diamond Ore",56);
			put("Diamond Block",57);
			put("Crafting Table",58);
			put("Wheat Crops",59);
			put("Farmland",60);
			put("Furnace",61);
			put("Burning Furnace",62);
			put("Standing Sign Block",63);
			put("Oak Door Block",64);
			put("Ladder",65);
			put("Rail",66);
			put("Cobblestone Stairs",67);
			put("Wall-mounted Sign Block",68);
			put("Lever",69);
			put("Stone Pressure Plate",70);
			put("Iron Door Block",71);
			put("Wooden Pressure Plate",72);
			put("Redstone Ore",73);
			put("Glowing Redstone Ore",74);
			put("Redstone Torch ",75);
			put("Redstone Torch ",76);
			put("Stone Button",77);
			put("Snow",78);
			put("Ice",79);
			put("Snow Block",80);
			put("Cactus",81);
			put("Clay",82);
			put("Sugar Canes",83);
			put("Jukebox",84);
			put("Oak Fence",85);
			put("Pumpkin",86);
			put("Netherrack",87);
			put("Soul Sand",88);
			put("Glowstone",89);
			put("Nether Portal",90);
			put("Jack o'Lantern",91);
			put("Cake Block",92);
			put("Redstone Repeater Block ",93);
			put("Redstone Repeater Block ",94);
			put("White Stained Glass",95);
			put("Wooden Trapdoor",96);
			put("Stone Monster Egg",97);
			put("Stone Bricks",98);
			put("Brown Mushroom Block",99);
			put("Red Mushroom Block",100);
			put("Iron Bars",101);
			put("Glass Pane",102);
			put("Melon Block",103);
			put("Pumpkin Stem",104);
			put("Melon Stem",105);
			put("Vines",106);
			put("Oak Fence Gate",107);
			put("Brick Stairs",108);
			put("Stone Brick Stairs",109);
			put("Mycelium",110);
			put("Lily Pad",111);
			put("Nether Brick",112);
			put("Nether Brick Fence",113);
			put("Nether Brick Stairs",114);
			put("Nether Wart",115);
			put("Enchantment Table",116);
			put("Brewing Stand",117);
			put("Cauldron",118);
			put("End Portal",119);
			put("End Portal Frame",120);
			put("End Stone",121);
			put("Dragon Egg",122);
			put("Redstone Lamp ",123);
			put("Redstone Lamp ",124);
			put("Double Oak Wood Slab",125);
			put("Oak Wood Slab",126);
			put("Cocoa",127);
			put("Sandstone Stairs",128);
			put("Emerald Ore",129);
			put("Ender Chest",130);
			put("Tripwire Hook",131);
			put("Tripwire",132);
			put("Emerald Block",133);
			put("Spruce Wood Stairs",134);
			put("Birch Wood Stairs",135);
			put("Jungle Wood Stairs",136);
			put("Command Block",137);
			put("Beacon",138);
			put("Cobblestone Wall",139);
			put("Flower Pot",140);
			put("Carrots",141);
			put("Potatoes",142);
			put("Wooden Button",143);
			put("Mob Head",144);
			put("Anvil",145);
			put("Trapped Chest",146);
			put("Weighted Pressure Plate ",147);
			put("Weighted Pressure Plate ",148);
			put("Redstone Comparator ",149);
			put("Redstone Comparator ",150);
			put("Daylight Sensor",151);
			put("Redstone Block",152);
			put("Nether Quartz Ore",153);
			put("Hopper",154);
			put("Quartz Block",155);
			put("Quartz Stairs",156);
			put("Activator Rail",157);
			put("Dropper",158);
			put("White Hardened Clay",159);
			put("White Stained Glass Pane",160);
			put("Acacia Leaves",161);
			put("Acacia Wood",162);
			put("Acacia Wood Stairs",163);
			put("Dark Oak Wood Stairs",164);
			put("Slime Block",165);
			put("Barrier",166);
			put("Iron Trapdoor",167);
			put("Prismarine",168);
			put("Sea Lantern",169);
			put("Hay Bale",170);
			put("White Carpet",171);
			put("Hardened Clay",172);
			put("Block of Coal",173);
			put("Packed Ice",174);
			put("Sunflower",175);
			put("Free-standing Banner",176);
			put("Wall-mounted Banner",177);
			put("Inverted Daylight Sensor",178);
			put("Red Sandstone",179);
			put("Red Sandstone Stairs",180);
			put("Double Red Sandstone Slab",181);
			put("Red Sandstone Slab",182);
			put("Spruce Fence Gate",183);
			put("Birch Fence Gate",184);
			put("Jungle Fence Gate",185);
			put("Dark Oak Fence Gate",186);
			put("Acacia Fence Gate",187);
			put("Spruce Fence",188);
			put("Birch Fence",189);
			put("Jungle Fence",190);
			put("Dark Oak Fence",191);
			put("Acacia Fence",192);
			put("Spruce Door Block",193);
			put("Birch Door Block",194);
			put("Jungle Door Block",195);
			put("Acacia Door Block",196);
			put("Dark Oak Door Block",197);
			put("End Rod",198);
			put("Chorus Plant",199);
			put("Chorus Flower",200);
			put("Purpur Block",201);
			put("Purpur Pillar",202);
			put("Purpur Stairs",203);
			put("Purpur Double Slab",204);
			put("Purpur Slab",205);
			put("End Stone Bricks",206);
			put("Beetroot Block",207);
			put("Grass Path",208);
			put("End Gateway",209);
			put("Repeating Command Block",210);
			put("Chain Command Block",211);
			put("Frosted Ice",212);
			put("Magma Block",213);
			put("Nether Wart Block",214);
			put("Red Nether Brick",215);
			put("Bone Block",216);
			put("Structure Void",217);
			put("Observer",218);
			put("White Shulker Box",219);
			put("Orange Shulker Box",220);
			put("Magenta Shulker Box",221);
			put("Light Blue Shulker Box",222);
			put("Yellow Shulker Box",223);
			put("Lime Shulker Box",224);
			put("Pink Shulker Box",225);
			put("Gray Shulker Box",226);
			put("Light Gray Shulker Box",227);
			put("Cyan Shulker Box",228);
			put("Purple Shulker Box",229);
			put("Blue Shulker Box",230);
			put("Brown Shulker Box",231);
			put("Green Shulker Box",232);
			put("Red Shulker Box",233);
			put("Black Shulker Box",234);
			put("White Glazed Terracotta",235);
			put("Orange Glazed Terracotta",236);
			put("Magenta Glazed Terracotta",237);
			put("Light Blue Glazed Terracotta",238);
			put("Yellow Glazed Terracotta",239);
			put("Lime Glazed Terracotta",240);
			put("Pink Glazed Terracotta",241);
			put("Gray Glazed Terracotta",242);
			put("Light Gray Glazed Terracotta",243);
			put("Cyan Glazed Terracotta",244);
			put("Purple Glazed Terracotta",245);
			put("Blue Glazed Terracotta",246);
			put("Brown Glazed Terracotta",247);
			put("Green Glazed Terracotta",248);
			put("Red Glazed Terracotta",249);
			put("Black Glazed Terracotta",250);
			put("White Concrete",251);
			put("White Concrete Powder",252);
			put("Structure Block",255);
			put("Iron Shovel",256);
			put("Iron Pickaxe",257);
			put("Iron Axe",258);
			put("Flint and Steel",259);
			put("Apple",260);
			put("Bow",261);
			put("Arrow",262);
			put("Coal",263);
			put("Diamond",264);
			put("Iron Ingot",265);
			put("Gold Ingot",266);
			put("Iron Sword",267);
			put("Wooden Sword",268);
			put("Wooden Shovel",269);
			put("Wooden Pickaxe",270);
			put("Wooden Axe",271);
			put("Stone Sword",272);
			put("Stone Shovel",273);
			put("Stone Pickaxe",274);
			put("Stone Axe",275);
			put("Diamond Sword",276);
			put("Diamond Shovel",277);
			put("Diamond Pickaxe",278);
			put("Diamond Axe",279);
			put("Stick",280);
			put("Bowl",281);
			put("Mushroom Stew",282);
			put("Golden Sword",283);
			put("Golden Shovel",284);
			put("Golden Pickaxe",285);
			put("Golden Axe",286);
			put("String",287);
			put("Feather",288);
			put("Gunpowder",289);
			put("Wooden Hoe",290);
			put("Stone Hoe",291);
			put("Iron Hoe",292);
			put("Diamond Hoe",293);
			put("Golden Hoe",294);
			put("Wheat Seeds",295);
			put("Wheat",296);
			put("Bread",297);
			put("Leather Helmet",298);
			put("Leather Tunic",299);
			put("Leather Pants",300);
			put("Leather Boots",301);
			put("Chainmail Helmet",302);
			put("Chainmail Chestplate",303);
			put("Chainmail Leggings",304);
			put("Chainmail Boots",305);
			put("Iron Helmet",306);
			put("Iron Chestplate",307);
			put("Iron Leggings",308);
			put("Iron Boots",309);
			put("Diamond Helmet",310);
			put("Diamond Chestplate",311);
			put("Diamond Leggings",312);
			put("Diamond Boots",313);
			put("Golden Helmet",314);
			put("Golden Chestplate",315);
			put("Golden Leggings",316);
			put("Golden Boots",317);
			put("Flint",318);
			put("Raw Porkchop",319);
			put("Cooked Porkchop",320);
			put("Painting",321);
			put("Golden Apple",322);
			put("Sign",323);
			put("Oak Door",324);
			put("Bucket",325);
			put("Water Bucket",326);
			put("Lava Bucket",327);
			put("Minecart",328);
			put("Saddle",329);
			put("Iron Door",330);
			put("Redstone",331);
			put("Snowball",332);
			put("Oak Boat",333);
			put("Leather",334);
			put("Milk Bucket",335);
			put("Brick",336);
			put("Clay",337);
			put("Sugar Canes",338);
			put("Paper",339);
			put("Book",340);
			put("Slimeball",341);
			put("Minecart with Chest",342);
			put("Minecart with Furnace",343);
			put("Egg",344);
			put("Compass",345);
			put("Fishing Rod",346);
			put("Clock",347);
			put("Glowstone Dust",348);
			put("Raw Fish",349);
			put("Cooked Fish",350);
			put("Ink Sack",351);
			put("Bone",352);
			put("Sugar",353);
			put("Cake",354);
			put("Bed",355);
			put("Redstone Repeater",356);
			put("Cookie",357);
			put("Map",358);
			put("Shears",359);
			put("Melon",360);
			put("Pumpkin Seeds",361);
			put("Melon Seeds",362);
			put("Raw Beef",363);
			put("Steak",364);
			put("Raw Chicken",365);
			put("Cooked Chicken",366);
			put("Rotten Flesh",367);
			put("Ender Pearl",368);
			put("Blaze Rod",369);
			put("Ghast Tear",370);
			put("Gold Nugget",371);
			put("Nether Wart",372);
			put("Potion",373);
			put("Glass Bottle",374);
			put("Spider Eye",375);
			put("Fermented Spider Eye",376);
			put("Blaze Powder",377);
			put("Magma Cream",378);
			put("Brewing Stand",379);
			put("Cauldron",380);
			put("Eye of Ender",381);
			put("Glistering Melon",382);
			put("Bottle o' Enchanting",384);
			put("Fire Charge",385);
			put("Book and Quill",386);
			put("Written Book",387);
			put("Emerald",388);
			put("Item Frame",389);
			put("Flower Pot",390);
			put("Carrot",391);
			put("Potato",392);
			put("Baked Potato",393);
			put("Poisonous Potato",394);
			put("Empty Map",395);
			put("Golden Carrot",396);
			put("Mob Head ",397);
			put("Carrot on a Stick",398);
			put("Nether Star",399);
			put("Pumpkin Pie",400);
			put("Firework Rocket",401);
			put("Firework Star",402);
			put("Enchanted Book",403);
			put("Redstone Comparator",404);
			put("Nether Brick",405);
			put("Nether Quartz",406);
			put("Minecart with TNT",407);
			put("Minecart with Hopper",408);
			put("Prismarine Shard",409);
			put("Prismarine Crystals",410);
			put("Raw Rabbit",411);
			put("Cooked Rabbit",412);
			put("Rabbit Stew",413);
			put("Rabbit's Foot",414);
			put("Rabbit Hide",415);
			put("Armor Stand",416);
			put("Iron Horse Armor",417);
			put("Golden Horse Armor",418);
			put("Diamond Horse Armor",419);
			put("Lead",420);
			put("Name Tag",421);
			put("Minecart with Command Block",422);
			put("Raw Mutton",423);
			put("Cooked Mutton",424);
			put("Banner",425);
			put("End Crystal",426);
			put("Spruce Door",427);
			put("Birch Door",428);
			put("Jungle Door",429);
			put("Acacia Door",430);
			put("Dark Oak Door",431);
			put("Chorus Fruit",432);
			put("Popped Chorus Fruit",433);
			put("Beetroot",434);
			put("Beetroot Seeds",435);
			put("Beetroot Soup",436);
			put("Dragon's Breath",437);
			put("Splash Potion",438);
			put("Spectral Arrow",439);
			put("Tipped Arrow",440);
			put("Lingering Potion",441);
			put("Shield",442);
			put("Elytra",443);
			put("Spruce Boat",444);
			put("Birch Boat",445);
			put("Jungle Boat",446);
			put("Acacia Boat",447);
			put("Dark Oak Boat",448);
			put("Totem of Undying",449);
			put("Shulker Shell",450);
			put("Iron Nugget",452);
			put("Knowledge Book",453);
			put("13 Disc",2256);
			put("Cat Disc",2257);
			put("Blocks Disc",2258);
			put("Chirp Disc",2259);
			put("Far Disc",2260);
			put("Mall Disc",2261);
			put("Mellohi Disc",2262);
			put("Stal Disc",2263);
			put("Strad Disc",2264);
			put("Ward Disc",2265);
			put("11 Disc",2266);
			put("Wait Disc",2267);
		 }
		 };
	}
	

	public static class MaterialDoesNotExistException extends Exception {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public MaterialDoesNotExistException(String errorMessage) {
			super(errorMessage);
		}
	}

}
