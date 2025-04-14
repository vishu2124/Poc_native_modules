#import "ScreenModule.h"

@implementation ScreenModule

RCT_EXPORT_MODULE()

RCT_EXPORT_METHOD(navigateToScreen:(NSString *)screenName
                  resolver:(RCTPromiseResolveBlock)resolve
                  rejecter:(RCTPromiseRejectBlock)reject)
{
    // Here you can implement your native navigation logic
    // For example, presenting a new view controller
    resolve([NSString stringWithFormat:@"Navigated to %@", screenName]);
}

@end 