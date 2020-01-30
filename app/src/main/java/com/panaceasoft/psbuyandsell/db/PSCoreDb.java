package com.ecomexpert.nlo.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.ecomexpert.nlo.db.common.Converters;
import com.ecomexpert.nlo.viewobject.AboutUs;
import com.ecomexpert.nlo.viewobject.Blog;
import com.ecomexpert.nlo.viewobject.ChatHistory;
import com.ecomexpert.nlo.viewobject.ChatHistoryMap;
import com.ecomexpert.nlo.viewobject.City;
import com.ecomexpert.nlo.viewobject.CityMap;
import com.ecomexpert.nlo.viewobject.DeletedObject;
import com.ecomexpert.nlo.viewobject.Image;
import com.ecomexpert.nlo.viewobject.Item;
import com.ecomexpert.nlo.viewobject.ItemCategory;
import com.ecomexpert.nlo.viewobject.ItemCollection;
import com.ecomexpert.nlo.viewobject.ItemCollectionHeader;
import com.ecomexpert.nlo.viewobject.ItemCondition;
import com.ecomexpert.nlo.viewobject.ItemCurrency;
import com.ecomexpert.nlo.viewobject.ItemDealOption;
import com.ecomexpert.nlo.viewobject.ItemFavourite;
import com.ecomexpert.nlo.viewobject.ItemFromFollower;
import com.ecomexpert.nlo.viewobject.ItemHistory;
import com.ecomexpert.nlo.viewobject.ItemLocation;
import com.ecomexpert.nlo.viewobject.ItemMap;
import com.ecomexpert.nlo.viewobject.ItemPriceType;
import com.ecomexpert.nlo.viewobject.ItemSpecs;
import com.ecomexpert.nlo.viewobject.ItemSubCategory;
import com.ecomexpert.nlo.viewobject.ItemType;
import com.ecomexpert.nlo.viewobject.Noti;
import com.ecomexpert.nlo.viewobject.PSAppInfo;
import com.ecomexpert.nlo.viewobject.PSAppSetting;
import com.ecomexpert.nlo.viewobject.PSAppVersion;
import com.ecomexpert.nlo.viewobject.PSCount;
import com.ecomexpert.nlo.viewobject.Rating;
import com.ecomexpert.nlo.viewobject.User;
import com.ecomexpert.nlo.viewobject.UserLogin;
import com.ecomexpert.nlo.viewobject.UserMap;
import com.ecomexpert.nlo.viewobject.messageHolder.Message;


/**
 * Created by Panacea-Soft on 11/20/17.
 * Contact Email : teamps.is.cool@gmail.com
 */

@Database(entities = {
        Image.class,
        User.class,
        UserLogin.class,
        AboutUs.class,
        ItemFavourite.class,
        Noti.class,
        ItemHistory.class,
        Blog.class,
        Rating.class,
        PSAppInfo.class,
        PSAppVersion.class,
        DeletedObject.class,
        City.class,
        CityMap.class,
        Item.class,
        ItemMap.class,
        ItemCategory.class,
        ItemCollectionHeader.class,
        ItemCollection.class,
        ItemSubCategory.class,
        ItemSpecs.class,
        ItemCurrency.class,
        ItemPriceType.class,
        ItemType.class,
        ItemLocation.class,
        ItemDealOption.class,
        ItemCondition.class,
        ItemFromFollower.class,
        Message.class,
        ChatHistory.class,
        ChatHistoryMap.class,
        PSAppSetting.class,
        UserMap.class,
        PSCount.class
}, version = 6, exportSchema = false)
// app version 2.2 = db version 6
// app version 2.1 = db version 6
// app version 2.0 = db version 6
// app version 1.9 = db version 6
// app version 1.8 = db version 5
// app version 1.7 = db version 4
// app version 1.6 = db version 4
// app version 1.5 = db version 4
// app version 1.4 = db version 3
// app version 1.3 = db version 3
// app version 1.2 = db version 2
// app version 1.0 = db version 1


@TypeConverters({Converters.class})

public abstract class PSCoreDb extends RoomDatabase {

    abstract public UserDao userDao();

    abstract public UserMapDao userMapDao();

    abstract public HistoryDao historyDao();

    abstract public SpecsDao specsDao();

    abstract public AboutUsDao aboutUsDao();

    abstract public ImageDao imageDao();

    abstract public ItemDealOptionDao itemDealOptionDao();

    abstract public ItemConditionDao itemConditionDao();

    abstract public ItemLocationDao itemLocationDao();

    abstract public ItemCurrencyDao itemCurrencyDao();

    abstract public ItemPriceTypeDao itemPriceTypeDao();

    abstract public ItemTypeDao itemTypeDao();

    abstract public RatingDao ratingDao();

    abstract public NotificationDao notificationDao();

    abstract public BlogDao blogDao();

    abstract public PSAppInfoDao psAppInfoDao();

    abstract public PSAppVersionDao psAppVersionDao();

    abstract public DeletedObjectDao deletedObjectDao();

    abstract public CityDao cityDao();

    abstract public CityMapDao cityMapDao();

    abstract public ItemDao itemDao();

    abstract public ItemMapDao itemMapDao();

    abstract public ItemCategoryDao itemCategoryDao();

    abstract public ItemCollectionHeaderDao itemCollectionHeaderDao();

    abstract public ItemSubCategoryDao itemSubCategoryDao();

    abstract public ChatHistoryDao chatHistoryDao();

    abstract public MessageDao messageDao();

    abstract public PSCountDao psCountDao();


//    /**
//     * Migrate from:
//     * version 1 - using Room
//     * to
//     * version 2 - using Room where the {@link } has an extra field: addedDateStr
//     */
//    public static final Migration MIGRATION_1_2 = new Migration(1, 2) {
//        @Override
//        public void migrate(@NonNull SupportSQLiteDatabase database) {
//            database.execSQL("ALTER TABLE news "
//                    + " ADD COLUMN addedDateStr INTEGER NOT NULL DEFAULT 0");
//        }
//    };

    /* More migration write here */
}