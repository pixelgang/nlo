package com.ecomexpert.nlo.di;


import com.ecomexpert.nlo.MainActivity;
import com.ecomexpert.nlo.ui.apploading.AppLoadingActivity;
import com.ecomexpert.nlo.ui.apploading.AppLoadingFragment;
import com.ecomexpert.nlo.ui.blog.detail.BlogDetailActivity;
import com.ecomexpert.nlo.ui.blog.detail.BlogDetailFragment;
import com.ecomexpert.nlo.ui.blog.list.BlogListActivity;
import com.ecomexpert.nlo.ui.blog.list.BlogListFragment;
import com.ecomexpert.nlo.ui.category.categoryfilter.CategoryFilterFragment;
import com.ecomexpert.nlo.ui.category.list.CategoryListActivity;
import com.ecomexpert.nlo.ui.category.list.CategoryListFragment;
import com.ecomexpert.nlo.ui.chat.chat.ChatActivity;
import com.ecomexpert.nlo.ui.chat.chat.ChatFragment;
import com.ecomexpert.nlo.ui.chat.chatimage.ChatImageFullScreenActivity;
import com.ecomexpert.nlo.ui.chat.chatimage.ChatImageFullScreenFragment;
import com.ecomexpert.nlo.ui.chathistory.BuyerFragment;
import com.ecomexpert.nlo.ui.chathistory.MessageFragment;
import com.ecomexpert.nlo.ui.chathistory.SellerFragment;
import com.ecomexpert.nlo.ui.city.menu.CityMenuFragment;
import com.ecomexpert.nlo.ui.city.selectedcity.SelectedCityActivity;
import com.ecomexpert.nlo.ui.city.selectedcity.SelectedCityFragment;
import com.ecomexpert.nlo.ui.contactus.ContactUsFragment;
import com.ecomexpert.nlo.ui.customcamera.CameraActivity;
import com.ecomexpert.nlo.ui.customcamera.CameraFragment;
import com.ecomexpert.nlo.ui.customcamera.setting.CameraSettingActivity;
import com.ecomexpert.nlo.ui.customcamera.setting.CameraSettingFragment;
import com.ecomexpert.nlo.ui.dashboard.DashBoardSearchCategoryFragment;
import com.ecomexpert.nlo.ui.dashboard.DashBoardSearchFragment;
import com.ecomexpert.nlo.ui.dashboard.DashBoardSearchSubCategoryFragment;
import com.ecomexpert.nlo.ui.dashboard.DashboardSearchByCategoryActivity;
import com.ecomexpert.nlo.ui.forceupdate.ForceUpdateActivity;
import com.ecomexpert.nlo.ui.forceupdate.ForceUpdateFragment;
import com.ecomexpert.nlo.ui.gallery.GalleryActivity;
import com.ecomexpert.nlo.ui.gallery.GalleryFragment;
import com.ecomexpert.nlo.ui.gallery.detail.GalleryDetailActivity;
import com.ecomexpert.nlo.ui.gallery.detail.GalleryDetailFragment;
import com.ecomexpert.nlo.ui.item.detail.ItemActivity;
import com.ecomexpert.nlo.ui.item.detail.ItemFragment;
import com.ecomexpert.nlo.ui.item.entry.ItemEntryActivity;
import com.ecomexpert.nlo.ui.item.entry.ItemEntryFragment;
import com.ecomexpert.nlo.ui.item.favourite.FavouriteListActivity;
import com.ecomexpert.nlo.ui.item.favourite.FavouriteListFragment;
import com.ecomexpert.nlo.ui.item.history.HistoryFragment;
import com.ecomexpert.nlo.ui.item.history.UserHistoryListActivity;
import com.ecomexpert.nlo.ui.item.itemcondition.ItemConditionFragment;
import com.ecomexpert.nlo.ui.item.itemcurrency.ItemCurrencyTypeFragment;
import com.ecomexpert.nlo.ui.item.itemdealoption.ItemDealOptionTypeFragment;
import com.ecomexpert.nlo.ui.item.itemfromfollower.ItemFromFollowerListActivity;
import com.ecomexpert.nlo.ui.item.itemfromfollower.ItemFromFollowerListFragment;
import com.ecomexpert.nlo.ui.item.itemlocation.ItemLocationFragment;
import com.ecomexpert.nlo.ui.item.itempricetype.ItemPriceTypeFragment;
import com.ecomexpert.nlo.ui.item.itemtype.ItemTypeFragment;
import com.ecomexpert.nlo.ui.item.itemtype.SearchViewActivity;
import com.ecomexpert.nlo.ui.item.loginUserItem.LoginUserItemFragment;
import com.ecomexpert.nlo.ui.item.loginUserItem.LoginUserItemListActivity;
import com.ecomexpert.nlo.ui.item.map.MapActivity;
import com.ecomexpert.nlo.ui.item.map.MapFragment;
import com.ecomexpert.nlo.ui.item.map.PickMapFragment;
import com.ecomexpert.nlo.ui.item.map.mapFilter.MapFilteringActivity;
import com.ecomexpert.nlo.ui.item.map.mapFilter.MapFilteringFragment;
import com.ecomexpert.nlo.ui.item.rating.RatingListActivity;
import com.ecomexpert.nlo.ui.item.rating.RatingListFragment;
import com.ecomexpert.nlo.ui.item.readmore.ReadMoreActivity;
import com.ecomexpert.nlo.ui.item.readmore.ReadMoreFragment;
import com.ecomexpert.nlo.ui.item.search.searchlist.SearchListActivity;
import com.ecomexpert.nlo.ui.item.search.searchlist.SearchListFragment;
import com.ecomexpert.nlo.ui.item.search.specialfilterbyattributes.FilteringActivity;
import com.ecomexpert.nlo.ui.item.search.specialfilterbyattributes.FilteringFragment;
import com.ecomexpert.nlo.ui.language.LanguageFragment;
import com.ecomexpert.nlo.ui.location.LocationActivity;
import com.ecomexpert.nlo.ui.notification.detail.NotificationActivity;
import com.ecomexpert.nlo.ui.notification.detail.NotificationFragment;
import com.ecomexpert.nlo.ui.notification.list.NotificationListActivity;
import com.ecomexpert.nlo.ui.notification.list.NotificationListFragment;
import com.ecomexpert.nlo.ui.notification.setting.NotificationSettingActivity;
import com.ecomexpert.nlo.ui.notification.setting.NotificationSettingFragment;
import com.ecomexpert.nlo.ui.privacypolicy.PrivacyPolicyActivity;
import com.ecomexpert.nlo.ui.privacypolicy.PrivacyPolicyFragment;
import com.ecomexpert.nlo.ui.safetytip.SafetyTipFragment;
import com.ecomexpert.nlo.ui.safetytip.SafetyTipsActivity;
import com.ecomexpert.nlo.ui.setting.SettingActivity;
import com.ecomexpert.nlo.ui.setting.SettingFragment;
import com.ecomexpert.nlo.ui.setting.appinfo.AppInfoActivity;
import com.ecomexpert.nlo.ui.setting.appinfo.AppInfoFragment;
import com.ecomexpert.nlo.ui.subcategory.SubCategoryActivity;
import com.ecomexpert.nlo.ui.subcategory.SubCategoryFragment;
import com.ecomexpert.nlo.ui.user.PasswordChangeActivity;
import com.ecomexpert.nlo.ui.user.PasswordChangeFragment;
import com.ecomexpert.nlo.ui.user.phonelogin.PhoneLoginActivity;
import com.ecomexpert.nlo.ui.user.phonelogin.PhoneLoginFragment;
import com.ecomexpert.nlo.ui.user.ProfileEditActivity;
import com.ecomexpert.nlo.ui.user.ProfileEditFragment;
import com.ecomexpert.nlo.ui.user.ProfileFragment;
import com.ecomexpert.nlo.ui.user.UserFBRegisterActivity;
import com.ecomexpert.nlo.ui.user.UserFBRegisterFragment;
import com.ecomexpert.nlo.ui.user.UserForgotPasswordActivity;
import com.ecomexpert.nlo.ui.user.UserForgotPasswordFragment;
import com.ecomexpert.nlo.ui.user.UserLoginActivity;
import com.ecomexpert.nlo.ui.user.UserLoginFragment;
import com.ecomexpert.nlo.ui.user.UserRegisterActivity;
import com.ecomexpert.nlo.ui.user.UserRegisterFragment;
import com.ecomexpert.nlo.ui.user.verifyphone.VerifyMobileActivity;
import com.ecomexpert.nlo.ui.user.userlist.UserListActivity;
import com.ecomexpert.nlo.ui.user.userlist.UserListFragment;
import com.ecomexpert.nlo.ui.user.userlist.detail.UserDetailActivity;
import com.ecomexpert.nlo.ui.user.userlist.detail.UserDetailFragment;
import com.ecomexpert.nlo.ui.user.verifyemail.VerifyEmailActivity;
import com.ecomexpert.nlo.ui.user.verifyemail.VerifyEmailFragment;
import com.ecomexpert.nlo.ui.user.verifyphone.VerifyMobileFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

//import com.ecomexpert.nlo.ui.followinguser.FollowingUserActivity;
//import com.ecomexpert.nlo.ui.followinguser.FollowingUserFragment;
//import com.ecomexpert.nlo.ui.followinguser.detail.FollowingUserDetailActivity;
//import com.ecomexpert.nlo.ui.followinguser.detail.FollowingUserDetailFragment;

/**
 * Created by Panacea-Soft on 11/15/17.
 * Contact Email : teamps.is.cool@gmail.com
 */


@Module
abstract class MainActivityModule {

    @ContributesAndroidInjector(modules = MainModule.class)
    abstract MainActivity contributeMainActivity();

    @ContributesAndroidInjector(modules = FavouriteListModule.class)
    abstract FavouriteListActivity contributeFavouriteListActivity();

    @ContributesAndroidInjector(modules = UserHistoryModule.class)
    abstract UserHistoryListActivity contributeUserHistoryListActivity();

    @ContributesAndroidInjector(modules = UserRegisterModule.class)
    abstract UserRegisterActivity contributeUserRegisterActivity();

    @ContributesAndroidInjector(modules = UserFBRegisterModule.class)
    abstract UserFBRegisterActivity contributeUserFBRegisterActivity();

    @ContributesAndroidInjector(modules = UserForgotPasswordModule.class)
    abstract UserForgotPasswordActivity contributeUserForgotPasswordActivity();

    @ContributesAndroidInjector(modules = UserLoginModule.class)
    abstract UserLoginActivity contributeUserLoginActivity();

    @ContributesAndroidInjector(modules = PasswordChangeModule.class)
    abstract PasswordChangeActivity contributePasswordChangeActivity();

    @ContributesAndroidInjector(modules = FilteringModule.class)
    abstract FilteringActivity filteringActivity();

    @ContributesAndroidInjector(modules = SubCategoryActivityModule.class)
    abstract SubCategoryActivity subCategoryActivity();

    @ContributesAndroidInjector(modules = NotificationModule.class)
    abstract NotificationListActivity notificationActivity();

    @ContributesAndroidInjector(modules = CameraSettingActivityModule.class)
    abstract CameraSettingActivity cameraSettingActivity();

   @ContributesAndroidInjector(modules = PhoneLoginActivityModule.class)
    abstract PhoneLoginActivity contributePhoneLoginActivity();

    @ContributesAndroidInjector(modules = SearchActivityModule.class)
    abstract SearchListActivity contributeSearchListActivity();

    @ContributesAndroidInjector(modules = CameraActivityModule.class)
    abstract CameraActivity contributeCameraActivity();

    @ContributesAndroidInjector(modules = ItemEntryActivityModule.class)
    abstract ItemEntryActivity contributeItemEntryActivity();

    @ContributesAndroidInjector(modules = NotificationDetailModule.class)
    abstract NotificationActivity notificationDetailActivity();

    @ContributesAndroidInjector(modules = ItemActivityModule.class)
    abstract ItemActivity itemActivity();

    @ContributesAndroidInjector(modules = SafetyTipsActivityModule.class)
    abstract SafetyTipsActivity safetyTipsActivity();

    @ContributesAndroidInjector(modules = GalleryDetailActivityModule.class)
    abstract GalleryDetailActivity galleryDetailActivity();

    @ContributesAndroidInjector(modules = GalleryActivityModule.class)
    abstract GalleryActivity galleryActivity();

    @ContributesAndroidInjector(modules = SearchByCategoryActivityModule.class)
    abstract DashboardSearchByCategoryActivity searchByCategoryActivity();

    @ContributesAndroidInjector(modules = readMoreActivityModule.class)
    abstract ReadMoreActivity readMoreActivity();

    @ContributesAndroidInjector(modules = EditSettingModule.class)
    abstract SettingActivity editSettingActivity();

    @ContributesAndroidInjector(modules = LanguageChangeModule.class)
    abstract NotificationSettingActivity languageChangeActivity();

    @ContributesAndroidInjector(modules = ProfileEditModule.class)
    abstract ProfileEditActivity contributeProfileEditActivity();

    @ContributesAndroidInjector(modules = AppInfoModule.class)
    abstract AppInfoActivity AppInfoActivity();

    @ContributesAndroidInjector(modules = CategoryListActivityAppInfoModule.class)
    abstract CategoryListActivity categoryListActivity();

    @ContributesAndroidInjector(modules = RatingListActivityModule.class)
    abstract RatingListActivity ratingListActivity();

    @ContributesAndroidInjector(modules = SelectedCityModule.class)
    abstract SelectedCityActivity selectedShopActivity();

    @ContributesAndroidInjector(modules = SelectedShopListBlogModule.class)
    abstract BlogListActivity selectedShopListBlogActivity();

    @ContributesAndroidInjector(modules = BlogDetailModule.class)
    abstract BlogDetailActivity blogDetailActivity();

    @ContributesAndroidInjector(modules = MapActivityModule.class)
    abstract MapActivity mapActivity();

    @ContributesAndroidInjector(modules = forceUpdateModule.class)
    abstract ForceUpdateActivity forceUpdateActivity();

    @ContributesAndroidInjector(modules = MapFilteringModule.class)
    abstract MapFilteringActivity mapFilteringActivity();

    @ContributesAndroidInjector(modules = SearchViewActivityModule.class)
    abstract SearchViewActivity searchViewActivity();

    @ContributesAndroidInjector(modules = chatActivityModule.class)
    abstract ChatActivity chatActivity();

    @ContributesAndroidInjector(modules = ImageFullScreenModule.class)
    abstract ChatImageFullScreenActivity imageFullScreenActivity();

    @ContributesAndroidInjector(modules = LoginUserItemModule.class)
    abstract LoginUserItemListActivity contributeLoginUserItemListActivity();

    @ContributesAndroidInjector(modules = FollowerUserModule.class)
    abstract UserListActivity contributeFollowerUserListActivity();

    @ContributesAndroidInjector(modules = VerifyEmailModule.class)
    abstract VerifyEmailActivity contributeVerifyEmailActivity();

    @ContributesAndroidInjector(modules = VerifyMobileModule.class)
    abstract VerifyMobileActivity contributeVerifyMobileActivity();

    @ContributesAndroidInjector(modules = FollowerUserDetailModule.class)
    abstract UserDetailActivity contributeFollowerUserDetailActivity();

    @ContributesAndroidInjector(modules = AppLoadingActivityModule.class)
    abstract AppLoadingActivity appLoadingActivity();

    @ContributesAndroidInjector(modules = ItemFromFollowerListModule.class)
    abstract ItemFromFollowerListActivity itemFromFollowerListActivity();

    @ContributesAndroidInjector(modules = LocationActivityModule.class)
    abstract LocationActivity locationActivity();

    @ContributesAndroidInjector(modules = PrivacyAndPolicyActivityModule.class)
    abstract PrivacyPolicyActivity privacyPolicyActivity();

}


@Module
abstract class MainModule {

    @ContributesAndroidInjector
    abstract ContactUsFragment contributeContactUsFragment();

    @ContributesAndroidInjector
    abstract VerifyMobileFragment contributeVerifyMobileFragment();

    @ContributesAndroidInjector
    abstract PhoneLoginFragment contributePhoneLoginFragment();

    @ContributesAndroidInjector
    abstract BuyerFragment contributeBuyerFragment();

    @ContributesAndroidInjector
    abstract SellerFragment contributeSellerFragment();

    @ContributesAndroidInjector
    abstract UserLoginFragment contributeUserLoginFragment();

    @ContributesAndroidInjector
    abstract UserForgotPasswordFragment contributeUserForgotPasswordFragment();

    @ContributesAndroidInjector
    abstract UserRegisterFragment contributeUserRegisterFragment();

    @ContributesAndroidInjector
    abstract UserFBRegisterFragment contributeUserFBRegisterFragment();

    @ContributesAndroidInjector
    abstract NotificationSettingFragment contributeNotificationSettingFragment();

    @ContributesAndroidInjector
    abstract ProfileFragment contributeProfileFragment();

    @ContributesAndroidInjector
    abstract LanguageFragment contributeLanguageFragment();

    @ContributesAndroidInjector
    abstract FavouriteListFragment contributeFavouriteListFragment();

    @ContributesAndroidInjector
    abstract SettingFragment contributEditSettingFragment();

    @ContributesAndroidInjector
    abstract HistoryFragment historyFragment();

    @ContributesAndroidInjector
    abstract NotificationListFragment contributeNotificationFragment();

    @ContributesAndroidInjector
    abstract AppInfoFragment contributeAppInfoFragment();

    @ContributesAndroidInjector
    abstract SelectedCityFragment contributeSelectedCityFragment();

    @ContributesAndroidInjector
    abstract SearchListFragment contributeSearchListFragment();

    @ContributesAndroidInjector
    abstract CategoryListFragment contributeCategoryListFragment();

    @ContributesAndroidInjector
    abstract MessageFragment contributeMessageFragment();

    @ContributesAndroidInjector
    abstract DashBoardSearchFragment contributeDashBoardSearchFragment();

    @ContributesAndroidInjector
    abstract VerifyEmailFragment contributeVerifyEmailFragment();

    @ContributesAndroidInjector
    abstract PrivacyPolicyFragment contributePrivacyPolicyFragment();
}


@Module
abstract class ProfileEditModule {
    @ContributesAndroidInjector
    abstract ProfileEditFragment contributeProfileEditFragment();
}

@Module
abstract class UserFBRegisterModule {
    @ContributesAndroidInjector
    abstract UserFBRegisterFragment contributeUserFBRegisterFragment();
}

@Module
abstract class ItemActivityModule {
    @ContributesAndroidInjector
    abstract ItemFragment contributeItemFragment();
}

@Module
abstract class SafetyTipsActivityModule {
    @ContributesAndroidInjector
    abstract SafetyTipFragment contributeSafetyTipFragment();
}

@Module
abstract class FavouriteListModule {
    @ContributesAndroidInjector
    abstract FavouriteListFragment contributeFavouriteFragment();
}


@Module
abstract class UserRegisterModule {
    @ContributesAndroidInjector
    abstract UserRegisterFragment contributeUserRegisterFragment();
}

@Module
abstract class UserForgotPasswordModule {
    @ContributesAndroidInjector
    abstract UserForgotPasswordFragment contributeUserForgotPasswordFragment();
}

@Module
abstract class UserLoginModule {
    @ContributesAndroidInjector
    abstract UserLoginFragment contributeUserLoginFragment();
}

@Module
abstract class PasswordChangeModule {
    @ContributesAndroidInjector
    abstract PasswordChangeFragment contributePasswordChangeFragment();
}


@Module
abstract class NotificationModule {
    @ContributesAndroidInjector
    abstract NotificationListFragment notificationFragment();
}

@Module
abstract class CameraSettingActivityModule {
    @ContributesAndroidInjector
    abstract CameraSettingFragment cameraSettingFragment();
}

@Module
abstract class PhoneLoginActivityModule {
    @ContributesAndroidInjector
    abstract PhoneLoginFragment cameraPhoneLoginFragment();
}

@Module
abstract class NotificationDetailModule {
    @ContributesAndroidInjector
    abstract NotificationFragment notificationDetailFragment();
}

@Module
abstract class UserHistoryModule {
    @ContributesAndroidInjector
    abstract HistoryFragment contributeHistoryFragment();
}

@Module
abstract class AppInfoModule {
    @ContributesAndroidInjector
    abstract AppInfoFragment contributeAppInfoFragment();
}

@Module
abstract class CategoryListActivityAppInfoModule {
    @ContributesAndroidInjector
    abstract CategoryListFragment contributeCategoryFragment();

}

@Module
abstract class RatingListActivityModule {
    @ContributesAndroidInjector
    abstract RatingListFragment contributeRatingListFragment();
}

@Module
abstract class readMoreActivityModule {
    @ContributesAndroidInjector
    abstract ReadMoreFragment contributeReadMoreFragment();
}

@Module
abstract class EditSettingModule {
    @ContributesAndroidInjector
    abstract SettingFragment EditSettingFragment();
}

@Module
abstract class LanguageChangeModule {
    @ContributesAndroidInjector
    abstract NotificationSettingFragment notificationSettingFragment();
}

@Module
abstract class EditProfileModule {
    @ContributesAndroidInjector
    abstract ProfileFragment ProfileFragment();
}

@Module
abstract class SubCategoryActivityModule {
    @ContributesAndroidInjector
    abstract SubCategoryFragment contributeSubCategoryFragment();

}

@Module
abstract class FilteringModule {

    @ContributesAndroidInjector
    abstract CategoryFilterFragment contributeTypeFilterFragment();

    @ContributesAndroidInjector
    abstract FilteringFragment contributeSpecialFilteringFragment();

}

@Module
abstract class SearchActivityModule {
    @ContributesAndroidInjector
    abstract SearchListFragment contributefeaturedProductFragment();

    @ContributesAndroidInjector
    abstract CategoryListFragment contributeCategoryFragment();

    @ContributesAndroidInjector
    abstract CategoryFilterFragment contributeTypeFilterFragment();

}


@Module
abstract class CameraActivityModule {
    @ContributesAndroidInjector
    abstract CameraFragment contributeCameraFragment();
}

@Module
abstract class ItemEntryActivityModule {
    @ContributesAndroidInjector
    abstract ItemEntryFragment contributeItemEntryFragment();
}

@Module
abstract class GalleryDetailActivityModule {
    @ContributesAndroidInjector
    abstract GalleryDetailFragment contributeGalleryDetailFragment();
}

@Module
abstract class GalleryActivityModule {
    @ContributesAndroidInjector
    abstract GalleryFragment contributeGalleryFragment();
}

@Module
abstract class SearchByCategoryActivityModule {

    @ContributesAndroidInjector
    abstract DashBoardSearchCategoryFragment contributeDashBoardSearchCategoryFragment();

    @ContributesAndroidInjector
    abstract DashBoardSearchSubCategoryFragment contributeDashBoardSearchSubCategoryFragment();
}

@Module
abstract class SelectedCityModule {

    @ContributesAndroidInjector
    abstract SearchListFragment contributefeaturedProductFragment();

    @ContributesAndroidInjector
    abstract CategoryListFragment categoryListFragment();

    @ContributesAndroidInjector
    abstract SelectedCityFragment contributeSelectedCityFragment();

    @ContributesAndroidInjector
    abstract CategoryFilterFragment contributeTypeFilterFragment();

    @ContributesAndroidInjector
    abstract CityMenuFragment contributeCityMenuFragment();

    @ContributesAndroidInjector
    abstract DashBoardSearchFragment contributeDashBoardSearchFragment();
}

@Module
abstract class SelectedShopListBlogModule {

    @ContributesAndroidInjector
    abstract BlogListFragment contributeSelectedShopListBlogFragment();

}

@Module
abstract class BlogDetailModule {

    @ContributesAndroidInjector
    abstract BlogDetailFragment contributeBlogDetailFragment();
}

@Module
abstract class MapActivityModule {

    @ContributesAndroidInjector
    abstract MapFragment contributeMapFragment();

    @ContributesAndroidInjector
    abstract PickMapFragment contributePickMapFragment();

}

@Module
abstract class forceUpdateModule {

    @ContributesAndroidInjector
    abstract ForceUpdateFragment contributeForceUpdateFragment();
}

@Module
abstract class MapFilteringModule {

    @ContributesAndroidInjector
    abstract MapFilteringFragment contributeMapFilteringFragment();
}

@Module
abstract class SearchViewActivityModule {

    @ContributesAndroidInjector
    abstract ItemCurrencyTypeFragment contributeItemConditionTypeFragment();

    @ContributesAndroidInjector
    abstract ItemConditionFragment contributeItemConditionFragment();

    @ContributesAndroidInjector
    abstract ItemLocationFragment contributeItemLocationFragment();

    @ContributesAndroidInjector
    abstract ItemDealOptionTypeFragment contributeItemDealOptionTypeFragment();

    @ContributesAndroidInjector
    abstract ItemPriceTypeFragment contributeItemPriceTypeFragment();

    @ContributesAndroidInjector
    abstract ItemTypeFragment contributeItemTypeFragment();


}

@Module
abstract class chatActivityModule {

    @ContributesAndroidInjector
    abstract ChatFragment contributeChatFragment();
}

@Module
abstract class ImageFullScreenModule {

    @ContributesAndroidInjector
    abstract ChatImageFullScreenFragment contributeImageFullScreenFragment();

}

@Module
abstract class LoginUserItemModule {
    @ContributesAndroidInjector
    abstract LoginUserItemFragment contributeLoginUserItemFragment();
}

@Module
abstract class FollowerUserModule {
    @ContributesAndroidInjector
    abstract UserListFragment contributeFollowerUserFragment();
}

@Module
abstract class VerifyEmailModule {
    @ContributesAndroidInjector
    abstract VerifyEmailFragment contributeVerifyEmailFragment();

}

@Module
abstract class VerifyMobileModule {
    @ContributesAndroidInjector
    abstract VerifyMobileFragment contributeVerifyMobileFragment();
}

@Module
abstract class FollowerUserDetailModule {
    @ContributesAndroidInjector
    abstract UserDetailFragment contributeFollowerUserDetailFragment();
}

@Module
abstract class AppLoadingActivityModule {

    @ContributesAndroidInjector
    abstract AppLoadingFragment contributeAppLoadingFragment();
}

@Module
abstract class ItemFromFollowerListModule {

    @ContributesAndroidInjector
    abstract ItemFromFollowerListFragment contributeItemFromFollowerListFragment();
}

@Module
abstract class LocationActivityModule {

    @ContributesAndroidInjector
    abstract ItemLocationFragment contributeItemLocationFragment();

}

@Module
abstract class PrivacyAndPolicyActivityModule {

    @ContributesAndroidInjector
    abstract PrivacyPolicyFragment contributePrivacyPolicyFragment();

}
