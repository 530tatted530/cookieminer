package com.gigavoid.supermod.cookiecraft.item;

import com.gigavoid.supermod.common.Register;
import com.gigavoid.supermod.cookiecraft.ModuleCookiecraft;
import com.gigavoid.supermod.cookiecraft.block.BlockCookieChocoFluid;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import java.util.Arrays;
import java.util.List;

public class CookiecraftItems {
    public static final ItemMagicCookie magicCookie = new ItemMagicCookie();
    public static final ItemCookieDough cookieDough = new ItemCookieDough();
    public static final ItemCookieGemMixture cookieGemMixture = new ItemCookieGemMixture();
    public static final ItemCookieGemMixtureIngot cookieGemMixtureIngot = new ItemCookieGemMixtureIngot();
    public static final ItemCookieUraniumRod cookieUraniumRod = new ItemCookieUraniumRod();
    public static final ItemCookieBucket cookieChocoBucket = new ItemCookieBucket(BlockCookieChocoFluid.instance);
<<<<<<< HEAD
    public static final ItemCookiePouch leatherCookiePouch = new ItemCookiePouch(64);
    public static final ItemCookiePouch woodenCookiePouch = new ItemCookiePouch(256);
    public static final ItemCookiePouch stoneCookiePouch = new ItemCookiePouch(2048);
    public static final ItemCookiePouch ironCookiePouch = new ItemCookiePouch(131072);
    public static final ItemCookiePouch goldenCookiePouch = new ItemCookiePouch(33554432);
    public static final ItemCookiePouch diamondCookiePouch = new ItemCookiePouch(536870912);
    public static final ItemCookiePouch emeraldCookiePouch = new ItemCookiePouch(68719476736L);
public static final ItemInfiniteCookiePouch infiniteCookiePouch = new ItemInfiniteCookiePouch();
public static final ItemCookiePouchOverflow overflowCookiePouch = new ItemCookiePouchOverflow();
=======
    public static final ItemCookiePouch leatherCookiePouch = new ItemCookiePouch(ModuleCookiecraft.config.pouchSizeLeather);
    public static final ItemCookiePouch woodenCookiePouch = new ItemCookiePouch(ModuleCookiecraft.config.pouchSizeWood);
    public static final ItemCookiePouch stoneCookiePouch = new ItemCookiePouch(ModuleCookiecraft.config.pouchSizeStone);
    public static final ItemCookiePouch ironCookiePouch = new ItemCookiePouch(ModuleCookiecraft.config.pouchSizeIron);
    public static final ItemCookiePouch goldenCookiePouch = new ItemCookiePouch(ModuleCookiecraft.config.pouchSizeGold);
    public static final ItemCookiePouch diamondCookiePouch = new ItemCookiePouch(ModuleCookiecraft.config.pouchSizeDiamond);
    public static final ItemCookiePouch emeraldCookiePouch = new ItemCookiePouch(ModuleCookiecraft.config.pouchSizeEmerald);
    public static final ItemInfiniteCookiePouch infiniteCookiePouch = new ItemInfiniteCookiePouch();
    public static final ItemCookiePouchOverflow overflowCookiePouch = new ItemCookiePouchOverflow();
>>>>>>> a04a098e98a0b8f5f8ae842b9969226fbfa0ec5b

    public static final List<ItemCookiePouch> cookiePouches = Arrays.asList(leatherCookiePouch, woodenCookiePouch, stoneCookiePouch, ironCookiePouch, goldenCookiePouch, diamondCookiePouch, emeraldCookiePouch);



public static void registerItems(Register register, FMLInitializationEvent event){
        register.registerItem(magicCookie, "cookie_magic", event);
        register.registerItem(cookieDough, "cookie_dough", event);
        register.registerItem(cookieGemMixture, "cookie_gem_mixture", event);
        register.registerItem(cookieGemMixtureIngot, "cookie_gem_mixture_ingot", event);
        register.registerItem(cookieUraniumRod, "cookie_uranium_rod", event);
        register.registerItem(cookieChocoBucket, "cookie_bucket_choco", event);
        register.registerItem(leatherCookiePouch, "cookie_pouch_leather", event);
        register.registerItem(woodenCookiePouch, "cookie_pouch_wood", event);
        register.registerItem(stoneCookiePouch, "cookie_pouch_stone", event);
        register.registerItem(ironCookiePouch, "cookie_pouch_iron", event);
        register.registerItem(goldenCookiePouch, "cookie_pouch_gold", event);
        register.registerItem(diamondCookiePouch, "cookie_pouch_diamond", event);
        register.registerItem(emeraldCookiePouch, "cookie_pouch_emerald", event);
        register.registerItem(infiniteCookiePouch, "cookie_pouch_infinite", event);
        register.registerItem(overflowCookiePouch, "cookie_pouch_overflow", event);
        }
        }
